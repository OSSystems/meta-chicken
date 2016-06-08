SECTION = "devel/chicken"
DESCRIPTION = "Thread- and exception aware, lazy-looking synchronization with timeouts - extending srfi-45"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://forcible.meta;md5=eb16bc460e039f4d5db556cff95e6828"
DEPENDS_append_class-cross = " chicken-egg-pigeon-hole-cross chicken-egg-llrb-tree-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-pigeon-hole-crosssdk chicken-egg-llrb-tree-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-pigeon-hole nativesdk-chicken-egg-llrb-tree chicken-egg-pigeon-hole-crosssdk chicken-egg-llrb-tree-crosssdk"
DEPENDS = " chicken-egg-pigeon-hole chicken-egg-llrb-tree chicken-egg-pigeon-hole-cross chicken-egg-llrb-tree-cross"
RDEPENDS_${PN} = " chicken-egg-pigeon-hole chicken-egg-llrb-tree"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/forcible/forcible-${PV}.tar.gz"

SRC_URI[md5sum] = "31b383bc84c2f8153621154a6cebb2ce"
SRC_URI[sha256sum] = "3c9a526fa99f89b3af1ba0f8a9cf5a183990b61bfc49fd480877503a09ddb26d"

S = "${WORKDIR}/forcible-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
