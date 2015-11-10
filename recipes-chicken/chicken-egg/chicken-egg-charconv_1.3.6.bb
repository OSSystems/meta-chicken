SECTION = "devel/chicken"
DESCRIPTION = "Character encoding utilities"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://charconv.meta;md5=69b09c23804e74df2ebfe7997ee27cbf"
DEPENDS_append_class-cross = " chicken-egg-iconv-cross chicken-egg-regex-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-iconv-crosssdk chicken-egg-regex-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-iconv nativesdk-chicken-egg-regex chicken-egg-iconv-crosssdk chicken-egg-regex-crosssdk"
DEPENDS = " chicken-egg-iconv chicken-egg-regex chicken-egg-iconv-cross chicken-egg-regex-cross"
RDEPENDS_${PN} = " chicken-egg-iconv chicken-egg-regex"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/charconv/charconv-${PV}.tar.gz"

SRC_URI[md5sum] = "a501a0fbf5671a2caba3b31bbeb1dc3f"
SRC_URI[sha256sum] = "e5c2c059ff83ff835d756847f412c2dfc8c2a8526e8a6235330a0c0271803910"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
