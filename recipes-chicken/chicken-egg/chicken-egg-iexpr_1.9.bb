SECTION = "devel/chicken"
DESCRIPTION = "Parser for I-expressions (SRFI-49)."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://iexpr.meta;md5=e3cc3a19e1206299919820a21c4ecb86"
DEPENDS_append_class-cross = " chicken-egg-make-cross chicken-egg-datatype-cross chicken-egg-silex-cross chicken-egg-lalr-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-make-crosssdk chicken-egg-datatype-crosssdk chicken-egg-silex-crosssdk chicken-egg-lalr-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-make nativesdk-chicken-egg-datatype nativesdk-chicken-egg-silex nativesdk-chicken-egg-lalr chicken-egg-make-crosssdk chicken-egg-datatype-crosssdk chicken-egg-silex-crosssdk chicken-egg-lalr-crosssdk"
DEPENDS = " chicken-egg-make chicken-egg-datatype chicken-egg-silex chicken-egg-lalr chicken-egg-make-cross chicken-egg-datatype-cross chicken-egg-silex-cross chicken-egg-lalr-cross"
RDEPENDS_${PN} = " chicken-egg-make chicken-egg-datatype chicken-egg-silex chicken-egg-lalr"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/iexpr/iexpr-${PV}.tar.gz"

SRC_URI[md5sum] = "954881c13c30c6d4472cd67c63fa5d72"
SRC_URI[sha256sum] = "136ff5688ad85867884684c90fa44f80eae3696600711c4ac874f57b1ed7f85e"

S = "${WORKDIR}/iexpr-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
