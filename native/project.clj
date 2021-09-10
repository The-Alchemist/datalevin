(def version "0.5.5")

(defproject datalevin-native version
  :description "Datalevin GraalVM native image and command line tool"
  :parent-project {:path    "../project.clj"
                   :inherit [:managed-dependencies :profiles :jvm-opts
                             :deploy-repositories :global-vars :javac-options
                             :uberjar-exclusions]}
  :dependencies [[org.clojure/clojure]
                 [org.clojure/tools.cli]
                 [borkdude/sci]
                 [com.cognitect/transit-clj]
                 [nrepl/bencode]
                 [com.taoensso/nippy]
                 [com.taoensso/timbre]
                 [persistent-sorted-set]
                 [org.graalvm.sdk/graal-sdk]
                 [org.graalvm.nativeimage/svm]
                 [org.lmdbjava/lmdbjava]
                 [org.clojure/test.check]
                 [org.bouncycastle/bcprov-jdk15on]
                 [babashka/babashka.pods]]
  :source-paths ["src/clj" "../src" "../test"]
  :java-source-paths ["src/java" "../src/java"]
  :test-paths ["../test"]
  :plugins [[lein-parent "0.3.8"]]
  )
