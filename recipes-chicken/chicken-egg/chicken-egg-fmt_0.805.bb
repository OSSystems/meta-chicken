SECTION = "devel/chicken"
DESCRIPTION = "Combinator Formatting"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://fmt.meta;md5=a76defd48485076cee01d23b0f2951f6"
DEPENDS_append_class-cross = " chicken-egg-utf8-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-utf8-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-utf8 chicken-egg-utf8-crosssdk"
DEPENDS = " chicken-egg-utf8 chicken-egg-utf8-cross chicken-egg-fmt-cross"
RDEPENDS_${PN} = " chicken-egg-utf8"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/fmt/fmt-${PV}.tar.gz"

SRC_URI[md5sum] = "8a52752ce82f828215d148644bd07379"
SRC_URI[sha256sum] = "f66ecbffe2ada9500672cba1978ebdd8032323db0cceb234a8a1b9bea3038ee2"

S = "${WORKDIR}/fmt-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
