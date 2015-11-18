SECTION = "devel/chicken"
DESCRIPTION = "A small egg to make life easier for git-using authors of Chicken eggs"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://git-egg-author.meta;md5=dafe28f8d32f63ff5e36bccb174056f0"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/git-egg-author/git-egg-author-${PV}.tar.gz"

SRC_URI[md5sum] = "20e2eaf5b07de489dec1be11bd7f4355"
SRC_URI[sha256sum] = "02407fde8674304456c2a3e8567bc268a898395b30e3ab027fa78a89f504f4e9"

S = "${WORKDIR}/git-egg-author-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
