SECTION = "devel/chicken"
DESCRIPTION = "Twitter API for Chicken Scheme"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://clucker.meta;md5=cabbecd9420cfdabdb38c6a943fb7d26"
DEPENDS_append_class-cross = " chicken-egg-oauth-cross chicken-egg-uri-common-cross chicken-egg-rest-bind-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-oauth-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-rest-bind-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-oauth nativesdk-chicken-egg-uri-common nativesdk-chicken-egg-rest-bind chicken-egg-oauth-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-rest-bind-crosssdk"
DEPENDS = " chicken-egg-oauth chicken-egg-uri-common chicken-egg-rest-bind chicken-egg-oauth-cross chicken-egg-uri-common-cross chicken-egg-rest-bind-cross"
RDEPENDS_${PN} = " chicken-egg-oauth chicken-egg-uri-common chicken-egg-rest-bind"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/clucker/clucker-${PV}.tar.gz"

SRC_URI[md5sum] = "8b3daf89fd2b9dc511ca1e0048dc272a"
SRC_URI[sha256sum] = "0acf84dcdd679b5c0a4f6253fa87427b9c5581fb2d54d22e16c79d797c6b2f1d"

S = "${WORKDIR}/clucker-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
