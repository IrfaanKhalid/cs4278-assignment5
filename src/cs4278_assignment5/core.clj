(ns cs4278-assignment5.core
  (:require [twilio.core :as twilio])
  (:require [clojure.string :as str])
  (:gen-class))

;; Contact Info
(def contact-info {"white"  {:name    "Jules White"
                             :email   "jules.white@gmail.com"}

                   "hemingway" {:name    "Graham Hemingway"
                                :email   "graham.hemingway@vanderbilt.edu"}

                   "khalid"   {:name    "Irfaan Khalid"
                               :email   "irfaan.khalid@vanderbilt.edu"}

                   "zeppos"   {:name    "Chancellor Zeppos"
                               :email   "zeppos@whitetents.biz"}})

;; Select a random person in our data store
(defn get-person []
  (rand-nth (keys contact-info)))

;; Return contact info for a given person
(defn get-contact-info [name]
  (get contact-info name))

;; Returns contact info for a random person in the data store
(defn get-raw-data [] 
  (get-contact-info (get-person)))  

;; Splits the data into a vector for easy parsing
(defn get-raw-data-vec [] 
  (str/split (str "" (get-raw-data)) #"\""))

;; Needed to avoid pseudorandomness issues
(def raw-data-vec 
  (get-raw-data-vec))

;; Returns string with final message from a vector
(defn get-final-data [data] 
  (str (nth data 1) " can be reached at " (nth data 3)))

(defn -main
  [& args]
  (twilio/with-auth "TWILIO_SID" "TWILIO_AUTH_TOKEN"
    @(twilio/send-sms
       {:From "+13127577784"
        :To "YOUR_PHONE_NUM"
        :Body (get-final-data raw-data-vec)})))
  