(ns hello.views.snippets.comments
  (:use [net.cgrand.enlive-html :only [defsnippet clone-for any-node replace-vars]]))

(defsnippet comments-snippet
  "hello/views/snippets/comments.html" [:table]
  [comments]

  [:tr]
  (clone-for [i (range (count comments))]
  	[:td any-node]
    (replace-vars (update-in (get comments i) [:id] #(.toString %))))
  )