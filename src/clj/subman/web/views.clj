(ns subman.web.views
  (:require [hiccup.page :refer [html5 include-css include-js]]
            [subman.helpers :refer [as-static make-static]]))

(defn index-page []
  (html5 [:head
          [:link {:rel "icon"
                  :type "image/png"
                  :href (first (make-static "favicon.png"))}]
          [:title "Subman - subtitle search service with api"]
          (as-static include-css
                     "components/bootstrap/dist/css/bootstrap.min.css"
                     "components/bootstrap/dist/css/bootstrap-theme.min.css"
                     "components/font-awesome/css/font-awesome.min.css"
                     "main.css")
          (as-static include-js
                     "components/jquery/dist/jquery.min.js"
                     "components/bootstrap/dist/js/bootstrap.min.js"
                     "main.js")]
         [:body [:script "subman.core.run();"]]))
