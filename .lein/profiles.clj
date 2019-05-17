{
 :user
 {
  :dependencies [
                 [pjstadig/humane-test-output "0.8.3"]
                 [fipp "0.6.14"]
                 [org.clojure/tools.nrepl "0.2.12"] ;; sayid
                 ]
  :injections [
               (require 'pjstadig.humane-test-output)
               (pjstadig.humane-test-output/activate!)
               ]
  :plugins [
            ;;[cider/cider-nrepl "0.20.0-SNAPSHOT"] ;; sayid
            ;;[com.billpiel/sayid "0.0.16"]
            [lein-ancient "0.6.14"]
            [pjstadig/humane-test-output "0.8.3"]
            [com.holychao/parallel-test "0.3.1"]
            [jonase/eastwood "0.2.5"]
            ]
  :jvm-opts [
             ;;"-Xms10g" ;;min vm size
             ;;"-Xmx10g" ;;max vm size
             "-server"

             "-XX:+OptimizeStringConcat"
             "-XX:+UseStringDeduplication"

             ;;zgc args (need jdk 11 or 12)
             ;;"-XX:+UnlockExperimentalVMOptions"
             ;;"-XX:+UseZGC"
             ;;"-Xms1g" ;;min vm size
             ;;"-Xmx10g" ;;max vm size
             ;;"-Xlog:gc"
             ]
  }
 }
