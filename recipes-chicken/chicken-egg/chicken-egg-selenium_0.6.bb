SECTION = "devel/chicken"
DESCRIPTION = "Chicken bindings for selenium"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://selenium.meta;md5=b6f0ae2867dbdb85432a896d9bbf8bbd"
DEPENDS_append_class-cross = " chicken-egg-http-client-cross chicken-egg-json-cross chicken-egg-intarweb-cross chicken-egg-regex-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-http-client-crosssdk chicken-egg-json-crosssdk chicken-egg-intarweb-crosssdk chicken-egg-regex-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-http-client nativesdk-chicken-egg-json nativesdk-chicken-egg-intarweb nativesdk-chicken-egg-regex chicken-egg-http-client-crosssdk chicken-egg-json-crosssdk chicken-egg-intarweb-crosssdk chicken-egg-regex-crosssdk"
DEPENDS = " chicken-egg-http-client chicken-egg-json chicken-egg-intarweb chicken-egg-regex chicken-egg-http-client-cross chicken-egg-json-cross chicken-egg-intarweb-cross chicken-egg-regex-cross"
RDEPENDS_${PN} = " chicken-egg-http-client chicken-egg-json chicken-egg-intarweb chicken-egg-regex"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/selenium/selenium-${PV}.tar.gz"

SRC_URI[md5sum] = "3b3608b8c632dc9911d20220fb263ebc"
SRC_URI[sha256sum] = "a739c64b808f2433caa63b23eb0ab894ae32792975de1f5c97ee13f1a204c6c8"

S = "${WORKDIR}/selenium-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
