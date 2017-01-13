SECTION = "devel/chicken"
DESCRIPTION = "Some list-creating routines"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://list-comprehensions.meta;md5=8b6a2f66e71c32df112cb16c98b058c9"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/list-comprehensions/list-comprehensions-${PV}.tar.gz"

SRC_URI[md5sum] = "60e0c0c90aa0ce828b92b8eec19d60a0"
SRC_URI[sha256sum] = "f0cedb8f568b1662c9098782b90b9879fa70a7e7205d015072f7c76a952670b6"

S = "${WORKDIR}/list-comprehensions-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
