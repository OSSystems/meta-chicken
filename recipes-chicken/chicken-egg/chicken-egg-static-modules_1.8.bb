SECTION = "devel/chicken"
DESCRIPTION = "ML-style module system for statically-typed languages."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://static-modules.meta;md5=97d5a170f47afdf50e3492d74a0d7c32"
DEPENDS_append_class-cross = " chicken-egg-datatype-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-datatype-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-datatype chicken-egg-datatype-crosssdk"
DEPENDS = " chicken-egg-datatype chicken-egg-datatype-cross"
RDEPENDS_${PN} = " chicken-egg-datatype"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/static-modules/static-modules-${PV}.tar.gz"

SRC_URI[md5sum] = "ee6dd7e5818aaf79853cf7d4830e71d5"
SRC_URI[sha256sum] = "fcc367905057e0d926ca5c79ea345ad08eb45c9317b17fba5319d9de1a272d44"

S = "${WORKDIR}/static-modules-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
