SECTION = "devel/chicken"
DESCRIPTION = "Fast I/O procedures specialized for different types"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://specialized-io.meta;md5=73119363689f9dd5172fd0c5b9319161"
DEPENDS_append_class-cross = " chicken-egg-numbers-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-numbers-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-numbers chicken-egg-numbers-crosssdk"
DEPENDS = " chicken-egg-numbers chicken-egg-numbers-cross"
RDEPENDS_${PN} = " chicken-egg-numbers"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/specialized-io/specialized-io-${PV}.tar.gz"

SRC_URI[md5sum] = "dd04eb9290c16e1b41427ee79ced4469"
SRC_URI[sha256sum] = "86b0502d030f33934205cec8768fa302b8dff45410784362338f64135191fb9e"

S = "${WORKDIR}/specialized-io-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
