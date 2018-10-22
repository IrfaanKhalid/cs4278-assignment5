(ns cs4278-assignment5.core
  (:gen-class))

(defn -main
  [& args]
  (twilio/with-auth "YOUR_TWILIO_ACCOUNT_SID" "YOUR_TWILIO_AUTH_TOKEN"
    @(twilio/send-sms
       {:From "YOUR_TWILIO_PHONE_NUMBER"
        :To "YOUR_PHONE_NUMBER"
        :Body "Hello from Clojure!"})))