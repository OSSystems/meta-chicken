SECTION = "devel/chicken"
DESCRIPTION = "A simple IRC client"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://irc.meta;md5=c0ed8e4fc737827e0e92611f77609485"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross chicken-egg-regex-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk chicken-egg-regex-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable nativesdk-chicken-egg-regex chicken-egg-matchable-crosssdk chicken-egg-regex-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-regex chicken-egg-matchable-cross chicken-egg-regex-cross"
RDEPENDS_${PN} = " chicken-egg-matchable chicken-egg-regex"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/irc/irc-${PV}.tar.gz"

SRC_URI[md5sum] = "6539eb9990c823fc885a3d0096c5fa31"
SRC_URI[sha256sum] = "40bc0b4bb7e3c5f7650d3d99cc243ae80331d7e64ff3aca0a98bf904c19c7237"

S = "${WORKDIR}/irc-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
