(defproject cs4278-assignment5 "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
    :dependencies [[org.clojure/clojure "1.7.0"]
                  [twilio-api "1.0.1"]]
  :main ^:skip-aot cs4278-assignment5.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})