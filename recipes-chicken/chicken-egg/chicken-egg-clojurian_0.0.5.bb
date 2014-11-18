SECTION = "devel/chicken"
DESCRIPTION = "Syntax and utility functions inspired by Clojure"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://clojurian.meta;md5=101bfc10e09af75abce9d2f32456cc1e"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "c8ac2855b88096b0eda9b2f0dc1410fa"
SRC_URI[sha256sum] = "46c706cf3a53053eac1e735637796e1bdeb3406cafa91b79623e276015a762e3"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
