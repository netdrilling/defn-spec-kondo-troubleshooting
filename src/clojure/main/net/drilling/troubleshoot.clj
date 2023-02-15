(ns clojure.main.net.drilling.troubleshoot
  (:require [orchestra.core :refer [defn-spec]]
            [medley.core]))

(defn yoink-nss [m]
  (medley.core/map-keys #(keyword (name %)) m))

(defn-spec um-yoink-nss map? [m map?]
  (medley.core/map-keys #(keyword (name %)) m))


(def tm {:a/b 34})

#_(yoink-nss tm)
#_(um-yoink-nss tm)
