SECTION = "devel/chicken"
DESCRIPTION = "Syntax and utility functions inspired by Clojure"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://clojurian.meta;md5=101bfc10e09af75abce9d2f32456cc1e"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/clojurian/clojurian-${PV}.tar.gz"

SRC_URI[md5sum] = "375afe2c141d6caca640aa191012eb94"
SRC_URI[sha256sum] = "f26ce22a01be478b33c147fe3db6400e2651a1b647d147a906d4f3af62ed525a"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
