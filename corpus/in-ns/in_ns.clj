(ns in-ns.in-ns)

(in-ns 'in-ns.refer-ns)

(foo)       ;; this should not give a warning
(foo 1 2 3) ;; this should give a warning
