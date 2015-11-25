SECTION = "devel/chicken"
DESCRIPTION = "lo ke pe'a jajgau ratcu ke'e genturfa'i"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://genturfahi.meta;md5=7abb9cc7d470d1214dfdc0db4c87d732"
DEPENDS_append_class-cross = " chicken-egg-make-cross chicken-egg-matchable-cross chicken-egg-moremacros-cross chicken-egg-sandbox-cross chicken-egg-srfi-37-cross chicken-egg-stack-cross chicken-egg-utf8-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-make-crosssdk chicken-egg-matchable-crosssdk chicken-egg-moremacros-crosssdk chicken-egg-sandbox-crosssdk chicken-egg-srfi-37-crosssdk chicken-egg-stack-crosssdk chicken-egg-utf8-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-make nativesdk-chicken-egg-matchable nativesdk-chicken-egg-moremacros nativesdk-chicken-egg-sandbox nativesdk-chicken-egg-srfi-37 nativesdk-chicken-egg-stack nativesdk-chicken-egg-utf8 chicken-egg-make-crosssdk chicken-egg-matchable-crosssdk chicken-egg-moremacros-crosssdk chicken-egg-sandbox-crosssdk chicken-egg-srfi-37-crosssdk chicken-egg-stack-crosssdk chicken-egg-utf8-crosssdk"
DEPENDS = " chicken-egg-make chicken-egg-matchable chicken-egg-moremacros chicken-egg-sandbox chicken-egg-srfi-37 chicken-egg-stack chicken-egg-utf8 chicken-egg-make-cross chicken-egg-matchable-cross chicken-egg-moremacros-cross chicken-egg-sandbox-cross chicken-egg-srfi-37-cross chicken-egg-stack-cross chicken-egg-utf8-cross chicken-egg-genturfahi-cross"
RDEPENDS_${PN} = " chicken-egg-make chicken-egg-matchable chicken-egg-moremacros chicken-egg-sandbox chicken-egg-srfi-37 chicken-egg-stack chicken-egg-utf8"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/genturfahi/genturfahi-${PV}.tar.gz"

SRC_URI[md5sum] = "3d5ee730e9c6608808bb957d76595222"
SRC_URI[sha256sum] = "d7ebf9fdb457bfe4c9f17d7d040ff568b870f542a88455fa433186748f86de2a"

S = "${WORKDIR}/genturfahi-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
