SECTION = "devel/chicken"
DESCRIPTION = "Approximate grep."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://agrep.meta;md5=d635ce96e30e4ce07c9f4e3b6405b6ea"
DEPENDS_append_class-cross = " chicken-egg-datatype-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-datatype-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-datatype chicken-egg-datatype-crosssdk"
DEPENDS = " chicken-egg-datatype chicken-egg-datatype-cross"
RDEPENDS_${PN} = " chicken-egg-datatype"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/agrep/agrep-${PV}.tar.gz"

SRC_URI[md5sum] = "a54781fc54b194a103b0f28e112c5ce0"
SRC_URI[sha256sum] = "bde319ebc3715c674bbf0892cee3c7b61b98d05d192ca6835dfefc843533c844"

S = "${WORKDIR}/agrep-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
