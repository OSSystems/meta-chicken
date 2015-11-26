SECTION = "devel/chicken"
DESCRIPTION = "Prcc is a PEG-like combinator parser library by packrat parsing"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://prcc.meta;md5=9c9675149d321f564f86112ba595d696"
DEPENDS_append_class-cross = " chicken-egg-stack-cross chicken-egg-srfi-41-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-stack-crosssdk chicken-egg-srfi-41-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-stack nativesdk-chicken-egg-srfi-41 chicken-egg-stack-crosssdk chicken-egg-srfi-41-crosssdk"
DEPENDS = " chicken-egg-stack chicken-egg-srfi-41 chicken-egg-stack-cross chicken-egg-srfi-41-cross"
RDEPENDS_${PN} = " chicken-egg-stack chicken-egg-srfi-41"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/prcc/prcc-${PV}.tar.gz"

SRC_URI[md5sum] = "4f66c58ce6cb6a20729f4a5ee1293313"
SRC_URI[sha256sum] = "db1db342e61c47fbe673d4ecd964f082bde12b404369fd5c78690defe012318b"

S = "${WORKDIR}/prcc-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
