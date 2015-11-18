SECTION = "devel/chicken"
DESCRIPTION = "Simple Test Mechanism for Scheme"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://testeez.meta;md5=e0db5230f1c790b1e3892f4542ce444d"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/testeez/testeez-${PV}.tar.gz"

SRC_URI[md5sum] = "d6266cb627b8e4e09ce67c6063776cd1"
SRC_URI[sha256sum] = "c4deb307312a7227efcb238c9716f2fabc3fa4decacaf2f223344e57e4223c01"

S = "${WORKDIR}/testeez-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
