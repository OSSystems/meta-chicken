SECTION = "devel/chicken"
DESCRIPTION = "A RSS parser"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://rss.meta;md5=1c79657c4f47be6ca604139c24fc1cfc"
DEPENDS_append_class-cross = " chicken-egg-ssax-cross chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-ssax-crosssdk chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-ssax nativesdk-chicken-egg-matchable chicken-egg-ssax-crosssdk chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-ssax chicken-egg-matchable chicken-egg-ssax-cross chicken-egg-matchable-cross"
RDEPENDS_${PN} = " chicken-egg-ssax chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/rss/rss-${PV}.tar.gz"

SRC_URI[md5sum] = "e532c580cd6bda0411f91d10200f706a"
SRC_URI[sha256sum] = "11663f61f496168b9e2198a651beaf188277f617703954d23b25c3d3cb673a5c"

S = "${WORKDIR}/rss-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
