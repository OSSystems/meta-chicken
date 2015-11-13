SECTION = "devel/chicken"
DESCRIPTION = "9p networked filesystem protocol implementation.  Includes high-level client and server code library"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://9p.meta;md5=90988b7ed991c5a29cf0999eca217ec6"
DEPENDS_append_class-cross = " chicken-egg-iset-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-iset-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-iset chicken-egg-iset-crosssdk"
DEPENDS = " chicken-egg-iset chicken-egg-iset-cross chicken-egg-9p-cross"
RDEPENDS_${PN} = " chicken-egg-iset"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/9p/9p-${PV}.tar.gz"

SRC_URI[md5sum] = "bb81b8318d505daab2ee5d4f1ac57a80"
SRC_URI[sha256sum] = "2ead4d2c8cc56c9fc8a2e3132c2030e23913ffbfa9f9deddbc52e59de46440b1"

S = "${WORKDIR}/9p-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
