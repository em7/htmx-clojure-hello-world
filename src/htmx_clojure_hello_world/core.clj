(ns htmx-clojure-hello-world.core
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.adapter.jetty :refer [run-jetty]]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]])
  (:gen-class))

(defroutes app-routes
           (GET "/" [] "<html>
<head>
<script src=\"https://unpkg.com/htmx.org@1.9.10\"></script>
<body>
<h1>Hello World</h1>
<button hx-get=\"/hello\" hx-target=\"#message\">Say Hi!</button>
<div id=\"message\"></div>
</body>
")
           (GET "/hello" [] "<p>Hello from HTMX!</p>")
           (route/not-found "<h1>404</h1>"))

(defn -main [& args]
  (let [port 3000]
    (run-jetty (wrap-defaults app-routes site-defaults) {:port 3000})))
