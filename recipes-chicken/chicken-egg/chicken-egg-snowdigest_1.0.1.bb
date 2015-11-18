SECTION = "devel/chicken"
DESCRIPTION = "Computation of message digests (CRC32, MD5, SHA-1, ...)"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://snowdigest.meta;md5=1b5a1d8b1c7db91b6ce0b98b50137260"
DEPENDS_append_class-cross = " chicken-egg-miscmacros-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-miscmacros-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-miscmacros chicken-egg-miscmacros-crosssdk"
DEPENDS = " chicken-egg-miscmacros chicken-egg-miscmacros-cross"
RDEPENDS_${PN} = " chicken-egg-miscmacros"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/snowdigest/snowdigest-${PV}.tar.gz"

SRC_URI[md5sum] = "60701d70494d085ec513e70c71e69c9b"
SRC_URI[sha256sum] = "8963967445b9d07e303d6e23a9f3835cfc1cd4343e3f3ef023c7c8385fb1673f"

S = "${WORKDIR}/snowdigest-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
