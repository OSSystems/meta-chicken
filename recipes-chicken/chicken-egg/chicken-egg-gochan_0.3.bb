SECTION = "devel/chicken"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://gochan.meta;md5=6c97bb6c4de278983b88c8ea3773dfb7"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/gochan/gochan-${PV}.tar.gz"

SRC_URI[md5sum] = "eb11670a63e65622880b33caebefcb01"
SRC_URI[sha256sum] = "c484713d652793aea8a0520e60ea39383022af30f4d62ab45a6f97b3467a305e"

S = "${WORKDIR}/gochan-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
