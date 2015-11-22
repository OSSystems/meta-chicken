SECTION = "devel/chicken"
DESCRIPTION = "Tiger/192 Message Digest"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://tiger-hash.meta;md5=4feb49d38e4894a117396223380f4a6c"
DEPENDS_append_class-cross = " chicken-egg-message-digest-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-message-digest-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-message-digest chicken-egg-message-digest-crosssdk"
DEPENDS = " chicken-egg-message-digest chicken-egg-message-digest-cross"
RDEPENDS_${PN} = " chicken-egg-message-digest"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/tiger-hash/tiger-hash-${PV}.tar.gz"

SRC_URI[md5sum] = "ace7bc0baba65bdd563f2fca7c03ee0d"
SRC_URI[sha256sum] = "be9d4bb89978aaf7b6ae615f35548436bf746dc65754c8bfb16fb9eab3eab928"

S = "${WORKDIR}/tiger-hash-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
