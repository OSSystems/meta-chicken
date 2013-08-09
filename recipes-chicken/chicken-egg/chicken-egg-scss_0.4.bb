SECTION = "devel/chicken"
DESCRIPTION = "An SCSS emitter with extensions"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://scss.meta;md5=dc93764aefad78496bb8fa92f0d5e168"
DEPENDS += "chicken-egg-scss-cross"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "763ce059a5686f15d8a6edf2eff6152e"
SRC_URI[sha256sum] = "beb0831d2ddea4937ab77ca5721c3e3dd5238ea5ed3b2c4d9f52144c6eb6bc65"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
