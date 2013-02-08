SECTION = "devel/chicken"
DESCRIPTION = "Oleg Kiselyov's XML parser"
LICENSE = "Public Domain"
LIC_FILES_CHKSUM = "file://ssax.meta;md5=835a961265c6391fbe0c0b03e3c17bd7"
DEPENDS_virtclass-cross += "chicken-egg-input-parse-cross"
DEPENDS += "chicken-egg-input-parse chicken-egg-input-parse-cross"
RDEPENDS_${PN} += "chicken-egg-input-parse"

inherit chicken_install

BBCLASSEXTEND = "cross"
