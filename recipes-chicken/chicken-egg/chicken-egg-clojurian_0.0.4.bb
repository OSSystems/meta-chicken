SECTION = "devel/chicken"
DESCRIPTION = "Syntax and utility functions inspired by Clojure"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://clojurian.meta;md5=101bfc10e09af75abce9d2f32456cc1e"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "6acf8d254d3c890a6ecbb8ccfe4aac87"
SRC_URI[sha256sum] = "7faaf1c079721501af9b314f1b87efb3232fbe2b12063f3089155192fbba144a"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
