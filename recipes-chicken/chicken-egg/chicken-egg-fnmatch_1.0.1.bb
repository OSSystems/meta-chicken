SECTION = "devel/chicken"
DESCRIPTION = "Test filenames against shell wildcard patterns using fnmatch"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://fnmatch.meta;md5=ded22cd5894891b258cfd18eed798ee8"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/fnmatch/fnmatch-${PV}.tar.gz"

SRC_URI[md5sum] = "17e7d63c9db1c32445366948dbed7f36"
SRC_URI[sha256sum] = "4398c22dc5fc211cbd8eb57063982b53e17796f0cf163df9299e609297f6f80e"

S = "${WORKDIR}/fnmatch-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
