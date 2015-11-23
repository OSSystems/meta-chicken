SECTION = "devel/chicken"
DESCRIPTION = "A cheeky IRC bot"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://vandusen.meta;md5=ef7771c5d44f0dcc658e98b4d5057753"
DEPENDS_append_class-cross = " chicken-egg-irc-cross chicken-egg-chicken-doc-cross chicken-egg-sandbox-cross chicken-egg-uri-common-cross chicken-egg-sql-de-lite-cross chicken-egg-make-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-irc-crosssdk chicken-egg-chicken-doc-crosssdk chicken-egg-sandbox-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-sql-de-lite-crosssdk chicken-egg-make-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-irc nativesdk-chicken-egg-chicken-doc nativesdk-chicken-egg-sandbox nativesdk-chicken-egg-uri-common nativesdk-chicken-egg-sql-de-lite nativesdk-chicken-egg-make chicken-egg-irc-crosssdk chicken-egg-chicken-doc-crosssdk chicken-egg-sandbox-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-sql-de-lite-crosssdk chicken-egg-make-crosssdk"
DEPENDS = " chicken-egg-irc chicken-egg-chicken-doc chicken-egg-sandbox chicken-egg-uri-common chicken-egg-sql-de-lite chicken-egg-make chicken-egg-irc-cross chicken-egg-chicken-doc-cross chicken-egg-sandbox-cross chicken-egg-uri-common-cross chicken-egg-sql-de-lite-cross chicken-egg-make-cross chicken-egg-vandusen-cross"
RDEPENDS_${PN} = " chicken-egg-irc chicken-egg-chicken-doc chicken-egg-sandbox chicken-egg-uri-common chicken-egg-sql-de-lite chicken-egg-make"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/vandusen/vandusen-${PV}.tar.gz"

SRC_URI[md5sum] = "50bbb405ca4f6636ffcba7b5cadc953b"
SRC_URI[sha256sum] = "ad35564f86ed4647d40392318ba56c162afd844d5653bf301b620b9a4b79f0ef"

S = "${WORKDIR}/vandusen-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
