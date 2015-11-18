SECTION = "devel/chicken"
DESCRIPTION = "A lightweight prototype object system"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://jso.meta;md5=c02e531b13b97d9725065a179a72572d"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/jso/jso-${PV}.tar.gz"

SRC_URI[md5sum] = "5632e423712d617f09f4bd7df296d201"
SRC_URI[sha256sum] = "71ce37651089e0be25d9bbd0a172dc7592c357e7f5bc0a56bd6162f8d07c7b00"

S = "${WORKDIR}/jso-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
