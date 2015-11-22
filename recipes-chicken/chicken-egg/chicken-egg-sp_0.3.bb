SECTION = "devel/chicken"
DESCRIPTION = "A simple parser generator"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://sp.meta;md5=0bc4ce9fa34c6dabbad23ddc57fd1d5c"
DEPENDS_append_class-cross = " chicken-egg-big-chicken-cross chicken-egg-honu-cross chicken-egg-matchable-cross chicken-egg-miscmacros-cross chicken-egg-typed-records-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-big-chicken-crosssdk chicken-egg-honu-crosssdk chicken-egg-matchable-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-typed-records-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-big-chicken nativesdk-chicken-egg-honu nativesdk-chicken-egg-matchable nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-typed-records chicken-egg-big-chicken-crosssdk chicken-egg-honu-crosssdk chicken-egg-matchable-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-typed-records-crosssdk"
DEPENDS = " chicken-egg-big-chicken chicken-egg-honu chicken-egg-matchable chicken-egg-miscmacros chicken-egg-typed-records chicken-egg-big-chicken-cross chicken-egg-honu-cross chicken-egg-matchable-cross chicken-egg-miscmacros-cross chicken-egg-typed-records-cross chicken-egg-sp-cross"
RDEPENDS_${PN} = " chicken-egg-big-chicken chicken-egg-honu chicken-egg-matchable chicken-egg-miscmacros chicken-egg-typed-records"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/sp/sp-${PV}.tar.gz"

SRC_URI[md5sum] = "0a900289b36e54002e78c61217cf9b07"
SRC_URI[sha256sum] = "d88877673959cf991690efad63ac3f4e4c3b38e71a81c22721cbbcba7b99ad81"

S = "${WORKDIR}/sp-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
