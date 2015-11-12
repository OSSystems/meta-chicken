SECTION = "devel/chicken"
DESCRIPTION = "Serialization of arbitrary data."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://s11n.meta;md5=73a54ebae9475c20233a97ce8fd3f46e"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-matchable-cross"
RDEPENDS_${PN} = " chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/s11n/s11n-${PV}.tar.gz"

SRC_URI[md5sum] = "a9eb67f999e3ffa8c4302c98189830a8"
SRC_URI[sha256sum] = "442172f23ff89065c75564a9473b8f1ec26fd0c28681af758540c22641a9de70"

S = "${WORKDIR}/s11n-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
