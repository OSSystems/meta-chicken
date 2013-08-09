SECTION = "devel/chicken"
DESCRIPTION = "A small awful app implementing a pastebin service"
LICENSE = "bsd"
LIC_FILES_CHKSUM = "file://pastiche.meta;md5=9f94823ce1ed54eb9d785d1880aa279c"
DEPENDS_virtclass-cross += "chicken-egg-awful-cross chicken-egg-awful-sql-de-lite-cross chicken-egg-simple-sha1-cross chicken-egg-html-parser-cross chicken-egg-colorize-cross chicken-egg-miscmacros-cross"
DEPENDS += "chicken-egg-awful chicken-egg-awful-sql-de-lite chicken-egg-simple-sha1 chicken-egg-html-parser chicken-egg-colorize chicken-egg-miscmacros chicken-egg-awful-cross chicken-egg-awful-sql-de-lite-cross chicken-egg-simple-sha1-cross chicken-egg-html-parser-cross chicken-egg-colorize-cross chicken-egg-miscmacros-cross"
RDEPENDS_${PN} += "chicken-egg-awful chicken-egg-awful-sql-de-lite chicken-egg-simple-sha1 chicken-egg-html-parser chicken-egg-colorize chicken-egg-miscmacros"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "7895d6775a9d1f3847612a4b7860c0b8"
SRC_URI[sha256sum] = "e43b3222d4235b0807c0b665255b16e3bc4a656116602ec5623a43534f8e77a4"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
