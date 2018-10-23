(ns cs4278-assignment5.core-test
  (:require [clojure.test :refer :all]
            [cs4278-assignment5.core :refer :all]))

;; Unit tests
;; Many functions cannot be easily tested deterministically, so we don't perform unit tests for them.
;;

(deftest get-contact-info-test
  (testing "Testing get-contact-info"
    (is (= (get-contact-info "white\") 
            \"{:name \"Jules White\", :email \"jules.white@gmail.com\"}")))))

(deftest get-contact-info-test
  (testing "Testing get-final-data"
    (is (= (get-final-data ["{:name " "Jules White" ", :email " "jules.white@gmail.com" "}"]) 
            "Jules White can be reached at jules.white@gmail.com"))))

;; Integration testing
;; This is done by simply testing the code and seeing if a text message is received.