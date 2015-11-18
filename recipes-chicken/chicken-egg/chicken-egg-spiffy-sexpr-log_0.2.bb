SECTION = "devel/chicken"
DESCRIPTION = "Symbolic expression log format for Spiffy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://spiffy-sexpr-log.meta;md5=b2224bf20441f35dc1f22b56e9c7a43d"
DEPENDS_append_class-cross = " chicken-egg-spiffy-cross chicken-egg-regex-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-spiffy-crosssdk chicken-egg-regex-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-spiffy nativesdk-chicken-egg-regex chicken-egg-spiffy-crosssdk chicken-egg-regex-crosssdk"
DEPENDS = " chicken-egg-spiffy chicken-egg-regex chicken-egg-spiffy-cross chicken-egg-regex-cross"
RDEPENDS_${PN} = " chicken-egg-spiffy chicken-egg-regex"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/spiffy-sexpr-log/spiffy-sexpr-log-${PV}.tar.gz"

SRC_URI[md5sum] = "682a65cd987c4a3579a51c8d5934cf03"
SRC_URI[sha256sum] = "e8ce0c646deb89aaa63b8bcc648b92ee00900777219689eaa86a5a458d4c1854"

S = "${WORKDIR}/spiffy-sexpr-log-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
