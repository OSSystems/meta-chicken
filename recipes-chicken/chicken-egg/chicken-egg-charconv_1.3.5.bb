SECTION = "devel/chicken"
DESCRIPTION = "Character encoding utilities"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://charconv.meta;md5=69b09c23804e74df2ebfe7997ee27cbf"
DEPENDS_append_class-cross = " chicken-egg-iconv-cross chicken-egg-regex-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-iconv-crosssdk chicken-egg-regex-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-iconv nativesdk-chicken-egg-regex chicken-egg-iconv-crosssdk chicken-egg-regex-crosssdk"
DEPENDS = " chicken-egg-iconv chicken-egg-regex chicken-egg-iconv-cross chicken-egg-regex-cross"
RDEPENDS_${PN} = " chicken-egg-iconv chicken-egg-regex"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "6071cdb6c1fd964aab5cae65729095ca"
SRC_URI[sha256sum] = "569692c21ea22e23c399ad961bd91bb3215920d6b9730cb6656437706507d82c"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
