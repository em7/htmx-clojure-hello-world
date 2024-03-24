(defproject htmx-clojure-hello-world "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [ring/ring "1.11.0"]
                 [ring/ring-defaults "0.4.0"]
                 [compojure "1.7.1"]]
  :java-source-paths ["java"]
  :repl-options {:init-ns htmx-clojure-hello-world.core}
  :main htmx-clojure-hello-world.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
