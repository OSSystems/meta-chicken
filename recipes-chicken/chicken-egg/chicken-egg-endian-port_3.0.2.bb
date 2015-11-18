SECTION = "devel/chicken"
DESCRIPTION = "An I/O port that supports different endian formats."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://endian-port.meta;md5=8e577add0ac161cad04f03469bd61a40"
DEPENDS_append_class-cross = " chicken-egg-iset-cross chicken-egg-endian-blob-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-iset-crosssdk chicken-egg-endian-blob-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-iset nativesdk-chicken-egg-endian-blob chicken-egg-iset-crosssdk chicken-egg-endian-blob-crosssdk"
DEPENDS = " chicken-egg-iset chicken-egg-endian-blob chicken-egg-iset-cross chicken-egg-endian-blob-cross"
RDEPENDS_${PN} = " chicken-egg-iset chicken-egg-endian-blob"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/endian-port/endian-port-${PV}.tar.gz"

SRC_URI[md5sum] = "3e866e07f090a513367db2aacbbbdd91"
SRC_URI[sha256sum] = "8d615e396f51c381fd06d93911364abd2747bd634aab708471e10cde5a3413fe"

S = "${WORKDIR}/endian-port-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
