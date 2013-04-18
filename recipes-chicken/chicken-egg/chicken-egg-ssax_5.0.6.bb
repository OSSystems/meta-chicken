SECTION = "devel/chicken"
DESCRIPTION = "Oleg Kiselyov's XML parser"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://ssax.meta;md5=835a961265c6391fbe0c0b03e3c17bd7"
DEPENDS_virtclass-cross += "chicken-egg-input-parse-cross"
DEPENDS += "chicken-egg-input-parse chicken-egg-input-parse-cross"
RDEPENDS_${PN} += "chicken-egg-input-parse"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "4a5ef314bf6ab092d341a6cd7a59f4b0"
SRC_URI[sha256sum] = "5c5de86599fe903a5428e17d6008479ec440afc2dc6dbb676733793835f447a0"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
