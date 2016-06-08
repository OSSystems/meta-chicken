SECTION = "devel/chicken"
DESCRIPTION = "URI generic syntax (RFC 3986) parsing and manipulation."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://uri-generic.meta;md5=e5e6ccf1b531f7d89bb94787ee2aa828"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-matchable-cross"
RDEPENDS_${PN} = " chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/uri-generic/uri-generic-${PV}.tar.gz"

SRC_URI[md5sum] = "68e7fee442c447c1d595b1edaf2017c7"
SRC_URI[sha256sum] = "773971535baf3aaca8825d762671308592e5005efa235cc4c1ad4bf036af021d"

S = "${WORKDIR}/uri-generic-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
