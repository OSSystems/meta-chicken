SECTION = "devel/chicken"
DESCRIPTION = "Parse Internet Message Format"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://rfc822.meta;md5=063f0580f1dc00b2b6c43a4b8ad49b54"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross chicken-egg-regex-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk chicken-egg-regex-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable nativesdk-chicken-egg-regex chicken-egg-matchable-crosssdk chicken-egg-regex-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-regex chicken-egg-matchable-cross chicken-egg-regex-cross"
RDEPENDS_${PN} = " chicken-egg-matchable chicken-egg-regex"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/rfc822/rfc822-${PV}.tar.gz"

SRC_URI[md5sum] = "621cc52c68f2b97c884bcb850e985154"
SRC_URI[sha256sum] = "fd6480f6299a80646765ca9e23147701645575d85fd469d433fdfccf0aa4633c"

S = "${WORKDIR}/rfc822-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
