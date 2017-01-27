SECTION = "devel/chicken"
DESCRIPTION = "A small awful app implementing a pastebin service"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://pastiche.meta;md5=fe3f453e361438820eace9170dd955e8"
DEPENDS_append_class-cross = " chicken-egg-awful-cross chicken-egg-awful-sql-de-lite-cross chicken-egg-simple-sha1-cross chicken-egg-intarweb-cross chicken-egg-html-parser-cross chicken-egg-colorize-cross chicken-egg-miscmacros-cross chicken-egg-utf8-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-awful-crosssdk chicken-egg-awful-sql-de-lite-crosssdk chicken-egg-simple-sha1-crosssdk chicken-egg-intarweb-crosssdk chicken-egg-html-parser-crosssdk chicken-egg-colorize-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-utf8-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-awful nativesdk-chicken-egg-awful-sql-de-lite nativesdk-chicken-egg-simple-sha1 nativesdk-chicken-egg-intarweb nativesdk-chicken-egg-html-parser nativesdk-chicken-egg-colorize nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-utf8 chicken-egg-awful-crosssdk chicken-egg-awful-sql-de-lite-crosssdk chicken-egg-simple-sha1-crosssdk chicken-egg-intarweb-crosssdk chicken-egg-html-parser-crosssdk chicken-egg-colorize-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-utf8-crosssdk"
DEPENDS = " chicken-egg-awful chicken-egg-awful-sql-de-lite chicken-egg-simple-sha1 chicken-egg-intarweb chicken-egg-html-parser chicken-egg-colorize chicken-egg-miscmacros chicken-egg-utf8 chicken-egg-awful-cross chicken-egg-awful-sql-de-lite-cross chicken-egg-simple-sha1-cross chicken-egg-intarweb-cross chicken-egg-html-parser-cross chicken-egg-colorize-cross chicken-egg-miscmacros-cross chicken-egg-utf8-cross"
RDEPENDS_${PN} = " chicken-egg-awful chicken-egg-awful-sql-de-lite chicken-egg-simple-sha1 chicken-egg-intarweb chicken-egg-html-parser chicken-egg-colorize chicken-egg-miscmacros chicken-egg-utf8"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/pastiche/pastiche-${PV}.tar.gz"

SRC_URI[md5sum] = "9619f5d27e37fa2b6b7c5015d7a70ae9"
SRC_URI[sha256sum] = "93178595a1ff79dd9fcf2aed1f16ae8b082c389d3e9c46416b446b76d34975b2"

S = "${WORKDIR}/pastiche-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
