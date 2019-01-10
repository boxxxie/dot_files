{
 ;; :repl
 ;; {
 ;;  :dependencies [
 ;;                 [org.clojure/tools.nrepl "0.2.13"]
 ;;                 ]
 ;;  }
 :user
 {
  :dependencies [
                 [pjstadig/humane-test-output "0.8.3"]
                 [fipp "0.6.14"]
                 ]
  :injections [ ;;(require ['clojure.pprint :as pprint]) ;;doesn't seem to work
               (require 'pjstadig.humane-test-output)
               (pjstadig.humane-test-output/activate!)
               ]
  :plugins [
            ;;[cider/cider-nrepl "0.20.0-SNAPSHOT"]
            [lein-ancient "0.6.14"]
            [pjstadig/humane-test-output "0.8.3"]
            [com.holychao/parallel-test "0.3.1"]
            [jonase/eastwood "0.2.5"]
            ]
  }
 }
