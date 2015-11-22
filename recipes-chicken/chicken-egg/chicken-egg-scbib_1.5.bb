SECTION = "devel/chicken"
DESCRIPTION = "Scientific bibliography management."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://scbib.meta;md5=190d37b8c64e95e12738a17756c0c83e"
DEPENDS_append_class-cross = " chicken-egg-regex-cross chicken-egg-datatype-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-regex-crosssdk chicken-egg-datatype-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-regex nativesdk-chicken-egg-datatype chicken-egg-regex-crosssdk chicken-egg-datatype-crosssdk"
DEPENDS = " chicken-egg-regex chicken-egg-datatype chicken-egg-regex-cross chicken-egg-datatype-cross chicken-egg-scbib-cross"
RDEPENDS_${PN} = " chicken-egg-regex chicken-egg-datatype"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/scbib/scbib-${PV}.tar.gz"

SRC_URI[md5sum] = "db040c9b4f3b05e94c600e0b87491f3a"
SRC_URI[sha256sum] = "74c73d826d0c8558c7eb8a1d14e872c755d11686028a89e0624aab00ac05ef21"

S = "${WORKDIR}/scbib-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
