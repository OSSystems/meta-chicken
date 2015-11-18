SECTION = "devel/chicken"
DESCRIPTION = "A template engine inspired by Jinja2 and Jingoo."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://ersatz.meta;md5=b97d5544ee13ca2efaeb05dcc44720bd"
DEPENDS_append_class-cross = " chicken-egg-make-cross chicken-egg-datatype-cross chicken-egg-silex-cross chicken-egg-lalr-cross chicken-egg-utf8-cross chicken-egg-uri-generic-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-make-crosssdk chicken-egg-datatype-crosssdk chicken-egg-silex-crosssdk chicken-egg-lalr-crosssdk chicken-egg-utf8-crosssdk chicken-egg-uri-generic-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-make nativesdk-chicken-egg-datatype nativesdk-chicken-egg-silex nativesdk-chicken-egg-lalr nativesdk-chicken-egg-utf8 nativesdk-chicken-egg-uri-generic chicken-egg-make-crosssdk chicken-egg-datatype-crosssdk chicken-egg-silex-crosssdk chicken-egg-lalr-crosssdk chicken-egg-utf8-crosssdk chicken-egg-uri-generic-crosssdk"
DEPENDS = " chicken-egg-make chicken-egg-datatype chicken-egg-silex chicken-egg-lalr chicken-egg-utf8 chicken-egg-uri-generic chicken-egg-make-cross chicken-egg-datatype-cross chicken-egg-silex-cross chicken-egg-lalr-cross chicken-egg-utf8-cross chicken-egg-uri-generic-cross"
RDEPENDS_${PN} = " chicken-egg-make chicken-egg-datatype chicken-egg-silex chicken-egg-lalr chicken-egg-utf8 chicken-egg-uri-generic"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/ersatz/ersatz-${PV}.tar.gz"

SRC_URI[md5sum] = "be0104134a7ae15d6a4b7149358211e5"
SRC_URI[sha256sum] = "9f699a438409b837d3ec9afecb2ce78526f23c089a817a555b0e352f6a78af7a"

S = "${WORKDIR}/ersatz-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
