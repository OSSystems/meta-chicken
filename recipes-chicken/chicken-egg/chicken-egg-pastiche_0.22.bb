SECTION = "devel/chicken"
DESCRIPTION = "A small awful app implementing a pastebin service"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://pastiche.meta;md5=fe3f453e361438820eace9170dd955e8"
DEPENDS_append_class-cross = " chicken-egg-awful-cross chicken-egg-awful-sql-de-lite-cross chicken-egg-simple-sha1-cross chicken-egg-intarweb-cross chicken-egg-html-parser-cross chicken-egg-colorize-cross chicken-egg-miscmacros-cross chicken-egg-utf8-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-awful-crosssdk chicken-egg-awful-sql-de-lite-crosssdk chicken-egg-simple-sha1-crosssdk chicken-egg-intarweb-crosssdk chicken-egg-html-parser-crosssdk chicken-egg-colorize-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-utf8-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-awful nativesdk-chicken-egg-awful-sql-de-lite nativesdk-chicken-egg-simple-sha1 nativesdk-chicken-egg-intarweb nativesdk-chicken-egg-html-parser nativesdk-chicken-egg-colorize nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-utf8 chicken-egg-awful-crosssdk chicken-egg-awful-sql-de-lite-crosssdk chicken-egg-simple-sha1-crosssdk chicken-egg-intarweb-crosssdk chicken-egg-html-parser-crosssdk chicken-egg-colorize-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-utf8-crosssdk"
DEPENDS = " chicken-egg-awful chicken-egg-awful-sql-de-lite chicken-egg-simple-sha1 chicken-egg-intarweb chicken-egg-html-parser chicken-egg-colorize chicken-egg-miscmacros chicken-egg-utf8 chicken-egg-awful-cross chicken-egg-awful-sql-de-lite-cross chicken-egg-simple-sha1-cross chicken-egg-intarweb-cross chicken-egg-html-parser-cross chicken-egg-colorize-cross chicken-egg-miscmacros-cross chicken-egg-utf8-cross"
RDEPENDS_${PN} = " chicken-egg-awful chicken-egg-awful-sql-de-lite chicken-egg-simple-sha1 chicken-egg-intarweb chicken-egg-html-parser chicken-egg-colorize chicken-egg-miscmacros chicken-egg-utf8"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "47c3584a59fa2dd35c8b87fcac3d46b6"
SRC_URI[sha256sum] = "99ad3ca3b694fd2c81423abc401151d9518d837ad08354c57d8c69750683d7df"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
